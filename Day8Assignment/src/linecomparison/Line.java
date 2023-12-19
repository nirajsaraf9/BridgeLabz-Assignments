package linecomparison;

class Line implements Comparable<Line> {
    double x1, y1, x2, y2;

    Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public int compareTo(Line otherLine) {
        double thisLength = this.calculateLength();
        double otherLength = otherLine.calculateLength();

       
        if (thisLength < otherLength)  // Compare the lengths of the two lines
        {
            return -1; // This line is shorter
        } else if (thisLength > otherLength) {
            return 1; // This line is longer
        } else {
            if (this.equals(otherLine))            // If lengths are equal, compare endpoints
            {
                return 0; // Lines are equal
            } else {
                
                if (this.x1 < otherLine.x1 || (this.x1 == otherLine.x1 && this.y1 < otherLine.y1))  // Compare based on the x-coordinates of endpoints
                {
                    return -1; // This line is less than the other
                } else {
                    return 1; // This line is greater than the other
                }
            }
        }
    }
}