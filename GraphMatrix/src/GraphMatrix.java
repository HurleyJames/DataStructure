public class GraphMatrix {
    //图的最大顶点数
    static final int MaxNum=20;
    //最大值
    static final int MaxValue=65535;

    //保存顶点信息
    char[] Vertex=new char[MaxNum];
    //图的类型
    int GType;
    //顶点的数量
    int VertexNum;
    //边的数量
    int EdgeNum;
    //保存边的权
    int[][] EdgeWeight=new int[MaxNum][MaxNum];
    //遍历标志
    int[] isTrav=new int[MaxNum];
}
