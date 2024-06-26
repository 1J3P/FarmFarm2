package com.example.farmfarm_refact.repository;


import com.example.farmfarm_refact.dto.FarmResponseDto;
import com.example.farmfarm_refact.entity.FarmEntity;
import com.example.farmfarm_refact.entity.ProductEntity;
import com.example.farmfarm_refact.entity.UserEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
    public List<ProductEntity> findAllByFarmAndStatusLike(FarmResponseDto.FarmReadResponseDto farm, String status);
    public Optional<ProductEntity> findBypIdAndStatusLike(Long pId, String status);
}
