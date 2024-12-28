FROM ubuntu:latest as base_image

RUN  apt update &&  apt upgrade -y &&  apt install -y  default-jdk scala

WORKDIR /workspace
