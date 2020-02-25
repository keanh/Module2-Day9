public class TriangleClassifier {

    public static String checkTriangle(int edge1, int edge2, int edge3) {
        if ((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1)){
            if (edge1 == edge2 && edge1 == edge3) {
                return "Tam giác đều";
            } else if (edge1 == edge2 || edge1 == edge3 || edge2 == edge3 && edge1 > 0 && edge2 > 0 && edge3 > 0){
                return "Tam giác cân";
            } else {
                return "Tam giác thường";
            }
        }else {
            return "Đây không phải tam giác";
        }
    }
}
