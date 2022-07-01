package com.lgy.demo22;

public class test1 {
    public static void main(String[] args) {
        ManageHeroNode manageHeroNode = new ManageHeroNode();
        manageHeroNode.add(new HeroNode(2,"卢俊义","老二"));
        manageHeroNode.add(new HeroNode(1,"宋江","及时雨"));
        manageHeroNode.add(new HeroNode(4,"孙策","小霸王"));
        manageHeroNode.add(new HeroNode(3,"吴用","智多星"));

        manageHeroNode.list();

    }
}

class HeroNode {
    public int no;
    public String name;
    public String nickName;
    public HeroNode next;

    public HeroNode(int no,String name,String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

class ManageHeroNode{
    private HeroNode head = new HeroNode(0, "", "");

    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            System.out.println(temp);
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
    }

    public void add(HeroNode heroNode) {
        boolean flag = false;
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > temp.no) {
                break;
            } else if (temp.next.no == temp.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.printf("编号%d已存在",heroNode.no);
        } else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }
}

