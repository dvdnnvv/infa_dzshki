import java.io.*;

// Пользовательский класс исключения для обработки пустого файла
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}