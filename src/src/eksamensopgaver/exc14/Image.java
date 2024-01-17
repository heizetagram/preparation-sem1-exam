package eksamensopgaver.exc14;

public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height) {
        setFileName(fileName);
        setWidth(width);
        setHeight(height);
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isKnownFileType() {
        return fileName.endsWith(".jpg") || fileName.endsWith(".gif") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".webp") || fileName.endsWith(".bmp");
    }

    public boolean isPortrait() {
        return height > width;
    }
    public boolean isLandscape() {
        return width > height;
    }
}
