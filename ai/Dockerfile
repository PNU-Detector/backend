FROM python:latest

WORKDIR /app/

COPY ./main.py /app/
COPY ./requirements.txt /app/
COPY ./building.pt /app/
RUN apt-get update && apt-get -y install libgl1-mesa-glx
RUN pip install -r requirements.txt

CMD uvicorn --host=0.0.0.0 --port 8000 main:app