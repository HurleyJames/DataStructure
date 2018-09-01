/**
 * 定义顺序表结构
 */
public class SLType {
    static final int MAXLEN=100;
    //保存顺序表的结构数组
    DATA[] ListData=new DATA[MAXLEN+1];
    //顺序表已存结点的数量
    int ListLen;

    //初始化顺序表
    void SLInit(SLType SL){
        //初始化为空表
        SL.ListLen=0;
    }

    int SLLength(SLType SL){
        //返回顺序表的元素数量
        return SL.ListLen;
    }

    //插入结点
    int SLInsert(SLType SL,int n,DATA data){
        int i;
        //顺序表结点数量已超过最大数量
        if(SL.ListLen>=MAXLEN){
            System.out.println("顺序表已满，不能插入结点！\n");
            //插入不成功
            return 0;
        }
        //插入结点序号不正确
        if(n<1||n>SL.ListLen-1){
            System.out.println("插入元素序号错误，不能插入元素！\n");
            return 0;
        }
        //将顺序表中的数据向后移动
        for(i=SL.ListLen;i>=n;i--){
            SL.ListData[i+1]=SL.ListData[i];
        }
        //插入结点
        SL.ListData[n]=data;
        //顺序表结点数量增加1
        SL.ListLen++;
        //插入成功
        return 1;
    }

    //增加元素到顺序表尾部
    int SLAdd(SLType SL,DATA data){
        //顺序表已满
        if(SL.ListLen>=MAXLEN){
            System.out.println("顺序表已满，不能再添加结点了！\n");
            return 0;
        }
        SL.ListData[++SL.ListLen]=data;
        return 1;
    }

    //删除顺序表中的数据元素
    int SLDelete(SLType SL,int n){
        int i;
        //删除结点序号不正确
        if(n<1||n>SL.ListLen+1){
            System.out.println("删除结点序号错误，不能删除结点！\n");
            return 0;
        }
        //将顺序表中的数据向前移动
        for(i=n;i<SL.ListLen;i++){
            SL.ListData[i]=SL.ListData[i+1];
        }
        //顺序表元素数量减1
        SL.ListLen--;
        return 1;
    }

    //根据序号返回数据元素
    DATA SLFindByNum(SLType SL,int n){
        //元素序号不正确
        if(n<1||n>SL.ListLen+1){
            System.out.println("结点序号错误，不能返回结点！\n");
            return null;
        }
        return SL.ListData[n];
    }

    //按关键字查询结点
    int SLFindByCont(SLType SL,String key){
        int i;
        for(i=1;i<SL.ListLen;i++){
            if(SL.ListData[i].key.compareTo(key)==0){
                //返回结点序号
                return i;
            }
        }
        return 0;
    }

    //显示顺序表中的所有结点
    int SLAll(SLType SL){
        int i;
        for(i=1;i<=SL.ListLen;i++){
            System.out.printf("(%s,%s,%d)\n",SL.ListData[i].key,SL.ListData[i].name,
                    SL.ListData[i].age);
        }
        return 0;
    }


}














