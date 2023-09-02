package com.detector.pnutour.controller;

import com.detector.pnutour.service.DetectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DetectController {
    private final DetectService detectService;

    public DetectController(DetectService detectService) {
        this.detectService = detectService;
    }


    //건물 검색
    @PostMapping("/detect/building")
    public ResponseEntity<?> detectBuilding(){
        return ResponseEntity.ok("ok");
    }
}
