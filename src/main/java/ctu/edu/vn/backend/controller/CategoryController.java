package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.CategoryDto;
import ctu.edu.vn.backend.entity.Category;
import ctu.edu.vn.backend.repository.CategoryRepository;
import ctu.edu.vn.backend.service.CategoryService;
import lombok.AllArgsConstructor;
import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@CrossOrigin
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> getAllCategory(){
        return new ResponseEntity<>(this.categoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable Long id){
        return new ResponseEntity<>(this.categoryService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategoryById(@PathVariable Long id){
        this.categoryService.deleteById(id);
        return new ResponseEntity<>("Delete category successfully", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveCategory(@RequestBody CategoryDto dto){
        return new ResponseEntity<>(this.categoryService.save(dto), HttpStatus.CREATED);
    }

//    @GetMapping("/page")
//    public ResponseEntity<Page<Category>> getAllCategory(
//            @PageableDefault(size = 5, sort = "name", direction = Sort.Direction.ASC) Pageable pageable) {
//        Page<Category> categories = categoryService.findAll(pageable);
//        return new ResponseEntity<>(categories, HttpStatus.OK);
//    }


}
