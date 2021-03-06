package com.warehouseService.rabbitmq.repositories;


import com.warehouseService.rabbitmq.domains.Content;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends CrudRepository<Content,String>{

    Content findBySlug(String slug);

    void deleteBySlug(String slug);
}
