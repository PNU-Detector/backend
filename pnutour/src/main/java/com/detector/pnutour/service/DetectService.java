package com.detector.pnutour.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.pytorch.Tensor;
import org.pytorch.Module;
import org.pytorch.IValue;
import java.io.IOException;
import java.io.InputStream;

@Service
@Slf4j
public class DetectService {
    private Module module;

    public void detectBuilding(){
        try (InputStream is = getClass().getResourceAsStream("/building.pt")){
            module = Module.load(is);
        } catch (IOException e){
            throw new RuntimeException("모델 파일을 불러올 수 없습니다.");
        }
    }


}
