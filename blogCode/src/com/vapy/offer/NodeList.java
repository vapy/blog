package com.vapy.offer;

/**
 * 
 * @author vapy 2016年9月1日
 * 
 */
class Node {
	public Node next;
	public int value;
}

public class NodeList {
	public static void main(String[] args) {
		Node node1 = new Node();
		node1.value = 4;
		Node node2 = new Node();
		node2.value = 5;
		Node node3 = new Node();
		node3.value = 7;
		Node node4 = new Node();
		node4.value = 1;
		Node node5 = new Node();
		node5.value = 6;

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		Node node = new NodeList().swap(node1);
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

	Node swap(Node list) {
		if (list == null) {
			return null;
		}
		if (list.next == null) {
			return list;
		}
		//尾元素
		Node end = list;
		//指针移动的前一个节点
		Node prev = null;
		//指针移动的当前节点
		Node curr = list;

		//循环，查找尾节点
		while (end.next != null) {
			end = end.next;
		}
		//新的尾节点，不断的存放接收的偶数元素
		Node newEnd = end;

		//将第一个偶数前的奇数放到链尾
		while (curr.value % 2 == 1 && curr != end) {
			newEnd.next = curr;
			curr = curr.next;
			newEnd.next.next = null;
			newEnd = newEnd.next;
		}

		//元素是偶数
		if (curr.value % 2 != 1) {
			//头结点为第一个偶数
			list = curr;

			while (curr != end) {
				if ((curr.value) % 2 != 1) {
					prev = curr;
					curr = curr.next;
				}
				else {
					//将pre指向后一个节点
					prev.next = curr.next;
					curr.next = null;
					//将当前的奇数放到链尾
					newEnd.next = curr;
					//链尾后移
					newEnd = curr;
					//继续判断
					curr = prev.next;
				}
			}
		}
		else {
			//根据理论，此时curr只有可能是尾节点，有while(curr.val % 2 == 0 && curr != end)判断
			prev = curr;
		}
		return reversal(list);
	}

	//反转链表
	Node reversal(Node head) {
		if (null == head || null == head.next) {
			return head;
		}
		Node reversedHead = reversal(head.next);
		head.next.next = head;
		head.next = null;
		return reversedHead;
	}
}