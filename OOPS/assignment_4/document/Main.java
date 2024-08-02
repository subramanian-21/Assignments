package OOPS.assignment_4.document;

class Main {

    public static void main(String[] args) {
        Document d1 = new PDFDocument();
        Document d2 = new TextDocument();
        Document d3 = new VideoDocument();

        d1.copy();
        d2.copy();
        d3.paste();
    }

}
