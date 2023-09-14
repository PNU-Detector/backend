from fastapi import FastAPI ,UploadFile
from ultralytics import YOLO
app = FastAPI()
model= YOLO('building.pt')
# 이미지 전처리 함수 정의

@app.post("/detect/")
async def predict(file: UploadFile):
    try:
        #이미지를 임시파일로 저장
        image_path = "temp_image.jpg"
        with open(image_path, "wb") as temp_image:
            temp_image.write(file.file.read())

        result = model.predict(source=image_path)[0]
        buildingName= model.names[int(result.boxes.cls[0])]

        return {"label": buildingName}
    except Exception as e:
        return {"error": str(e)}
