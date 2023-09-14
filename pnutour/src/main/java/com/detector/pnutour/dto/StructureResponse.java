package com.detector.pnutour.dto;

import com.detector.pnutour.entity.Structure;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

public class StructureResponse {
    @Getter
    public static class StructureDetectDTO {
        private String code;
        private String name;
    }

    @Getter
    public static class StructureFindDTO {
        private String code;
        private String name;
        private String info;
        private String latitude;
        private String longitude;

        public StructureFindDTO(Structure structure) {
            this.code = structure.getCode();
            this.name = structure.getName();
            this.info = structure.getInfo();
            this.latitude = structure.getLatitude();
            this.longitude = structure.getLongitude();

        }
    }
    @Getter
    public static class StructureFindAllDTO {
         private List<StructureDTO> structures;

        public StructureFindAllDTO(List<Structure> structures) {
            this.structures = structures.stream()
                        .map(structure -> new StructureDTO(structure)).collect(Collectors.toList());
        }

        @Getter
        public class StructureDTO {
            private String code;
            private String name;
            private String latitude;
            private String longitude;
            private String info;

            public StructureDTO(Structure structure){
                this.code = structure.getCode();
                this.name = structure.getName();
                this.latitude = structure.getLatitude();
                this.longitude = structure.getLongitude();
                this.info = structure.getInfo();
            }
        }

    }
}
