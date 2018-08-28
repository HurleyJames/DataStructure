public class SingleLinkedList {

    Node head;

    /**
     * 增加操作
     * 直接在链表的最后插入新增的节点即可
     * 将原本最后一个节点的next指向新节点
     * @param node
     */
    public void addNode(Node node){
        //链表中有节点，遍历到最后一个节点
        Node temp=head;
        //遍历单链表，直到遍历到最后一个则跳出循环
        while(temp.next!=null){
            //往后移一个节点，指向下一个节点
            temp=temp.next;
        }
        //temp为最后一个节点或者是头节点，将其next指向新节点
        temp.next=node;
    }

    /**
     * 在链表的指定位置插入节点
     * @param index
     * @param node
     */
    public void insertNodeByIndex(int index,Node node){
        //判断指定位置是否合法
        if(index<1||index>length()+1){
            System.out.println("插入位置不合法");
            return ;
        }
        //记录节点位置
        int length=1;
        //可移动的指针
        Node temp=head;
        //遍历单链表
        while(head.next!=null){
            //判断是否到达指定位置
            if(index==length++){
                //前一个节点     当前位置        后一个节点
                //temp          temp.next       temp.next.next
                node.next=temp.next;
                temp.next=node;
                return ;
            }
            temp=temp.next;
        }
    }

    /**
     * 删除指定位置的节点
     * @param index
     */
    public void delnNodeByIndex(int index){
        //判断index是否合理
        if(index<1||index>length()){
            System.out.println("位置不合法");
            return ;
        }
        int length=1;
        Node temp=head;
        while(temp.next!=null){
            if(index==length++){
                //删除操作
                temp.next=temp.next.next;
                return ;
            }
            temp=temp.next;
        }
    }

    /**
     * 计算单链表的长度
     * @return
     */
    public int length(){
        int length=0;
        Node temp=head;
        while(temp.next!=null){
            length++;
            //节点依次往后递增
            temp=temp.next;
        }
        return length;
    }

    /**
     * 遍历单链表，打印所有data
     */
    public void print(){
        Node temp=head.next;
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.println();
    }
}










