package C21406436;

import processing.core.PVector;

public class Part2 extends VisualSetup {
    
    //declare variables
    VisualSetup part;
    float width, height;
    private PVector center;

    public Part2(float width, float height, PVector center, VisualSetup part)
    {
        this.width = width;
        this.height = height;
        this.center = center;
        this.part = part;
    }

    public void render()
    {
        part.stroke(255,0,255);
        part.ellipse(center.x, center.y, 200, 200);
    }
}
