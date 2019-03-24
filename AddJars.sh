#!/usr/bin/env bash

path=./target/dependencies

java -cp "$path/*"  fitnesseMain.FitNesseMain -p 9092 -d ./src/main/resources -e 0