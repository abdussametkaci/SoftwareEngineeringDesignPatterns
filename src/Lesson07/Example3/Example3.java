package Lesson07.Example3;

import java.util.ArrayList;

public class Example3 {

    public static void main(String[] args) {
        Document d = new Document();
        d.addPage(new Page());
        d.addPage(new Page());
        d.showPages();
    }

    //high level
    static class Document {

        ArrayList<Page> pages = new ArrayList();

        void addPage(Page p) {
            pages.add(p);
        }

        void showPages() {
            for (Page page : pages) {
                page.render();
            }
        }
    }

    //low level
    static class Page {

        void render() {
            System.out.println("rendered");
        }
    }
}
