package fr.michaelvilleneuve.helpers;

import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;
import org.opencv.core.Size;

/**
 * Created by allgood on 05/03/16.
 */
public class Quadrilateral {
    public MatOfPoint contour;
    public Point[] points;

    public Quadrilateral(MatOfPoint contour, Point[] points) {
        this.contour = contour;
        this.points = points;
    }

}
