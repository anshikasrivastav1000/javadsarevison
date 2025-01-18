package com.springSecurity.service;

import com.springSecurity.Repository.PostRepository;
import com.springSecurity.dto.PostDto;
import com.springSecurity.entities.PostEntity;
import com.springSecurity.exceptions.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PostServiceImp implements PostService{
    private final ModelMapper modelMapper;
    private final PostRepository postRepository;

    public PostServiceImp(ModelMapper modelMapper, PostRepository postRepository) {
        this.modelMapper = modelMapper;
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        PostEntity postEntity =  modelMapper.map(postDto,PostEntity.class);
        return modelMapper.map(postRepository.save(postEntity),PostDto.class);
    }

    @Override
    public List<PostDto> getAllPost() {

        return postRepository
                .findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity,PostDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDto getPostById(Long id) {
        PostEntity postEntity = postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post not found with this id :" + id));
        return modelMapper.map(postEntity,PostDto.class);
    }
}
