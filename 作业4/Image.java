

abstract class Image {
    protected ImageImp imp = null;
    protected Matrix matrix = null;

    public void setImageImp(ImageImp imp){
        this.imp = imp;
    }

    public void printImage() {
        if (matrix != null && matrix.getData() != null) {
            imp.doPaint(matrix);
        }
    }

    public abstract void parseFile(String fileName);
}
