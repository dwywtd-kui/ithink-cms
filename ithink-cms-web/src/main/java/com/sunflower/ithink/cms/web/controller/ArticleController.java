package com.sunflower.ithink.cms.web.controller;

import com.ithink.cms.core.domin.dto.ArticleDto;
import com.ithink.cms.core.service.ArticleService;
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
