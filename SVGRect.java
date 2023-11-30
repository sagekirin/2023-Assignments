//SVGRect object from Assignment 7A

public class SVGRect{
    private
    float width, height, offsetX, offsetY, stroke_Width;  //sets values to private (cannot be directly edited by end user)
    private
    String fill_Color, stroke_Color;  //Block all similar datatypes to one area, then mark private

    SVGRect() {  //Default constructor with basic paramaters
        width = 1;
        height = 1;
        fill_Color = "#0000FF";
        stroke_Color = "#0F0F0F";
        stroke_Width = 1.0f;
        offsetX = 0;
        offsetY = 0;
    }
    SVGRect(float w, float h, String fC, String sC) {     //Overloaded constructor with some assignable paramaters
        width = w;
        height = h;
        fill_Color = fC;
        stroke_Color = sC;
        stroke_Width = 1.0f;
        offsetX = 0;
        offsetY = 0;
    }

    public boolean setDimensions(float x, float y) {  //Bool to detect whether entered x and y values are valid; sets if so
        if (x > 0 && y > 0){
            width = x;
            height = y;
            System.out.println("Rectangle updated!");
            return true;
        }
        System.out.println("Invalid input – rectangle not changed.");
        return false;
    }
    public void SetOffsets(float x, float y) { //Sets offset values; returns nothing
        offsetX = x;
        offsetY = y;
    }
    public boolean set_fill_and_stroke(String fill, String stroke, float sWidth) { //Determines if entered width is valid, then sets values if so
        if (sWidth > 0) {
            fill_Color = fill;
            stroke_Color = stroke;
            stroke_Width = sWidth;
            System.out.println("Rectangle updated!");
            return true;
        }
        System.out.println("Invalid input – rectangle not changed.");
        return false;
    }
    public void Print_XML() {  //Prints the XML file (lotta formatting work w/this one)
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        System.out.println("<svg");
        System.out.println("    xmlns=\"http://www.w3.org/2000/svg\"");
        System.out.println("    xmlns:svg=\"http://www.w3.org/2000/svg\">");
        System.out.println("    <rect");
        System.out.println("        style=\"fill:" + fill_Color + "; stroke:" + stroke_Color + "; stroke-width:" + stroke_Width + "\"");
        System.out.println("        width=\"" + width + "\"");
        System.out.println("        height=\"" + height + "\"");
        System.out.println("        x=\"" + offsetX + "\"");
        System.out.println("        y=\"" + offsetY + "\" />");
        System.out.println("</svg>");
    }
}
