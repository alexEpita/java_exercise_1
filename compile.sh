#!/bin/bash
mkdir -p bin
javac -d bin $(find ./src/ -type f -name '*.java')
