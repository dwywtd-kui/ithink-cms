package com.haan.ithink.cms.controller;

import com.haan.ithink.cms.domin.dto.ArticleDto;
import com.haan.ithink.cms.service.ArticleService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lkhan
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    private ArticleService service;

    public ArticleController(ArticleService service){
        this.service = service;
    }

    @PostMapping("")
    public ArticleDto create(@RequestBody ArticleDto dto){
        return service.create(dto);
    }

    @GetMapping("/{id}")
    public ArticleDto findById(@PathVariable("id") Long id){
        return service.findById(id);
    }
}
