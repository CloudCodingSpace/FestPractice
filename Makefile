.SILENT:
all: build run

build:
	javac ./src/$(class).java -d bin

run:
	java -cp bin $(class)
