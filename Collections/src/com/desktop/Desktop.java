package com.desktop;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Node {
	private String app;
	public boolean currentapp;

	Node(String app) {
		this.app = app;
	}

	public String getApp() {
		return app;
	}

	public String toString() {
		return "<" + app + ">";
	}

	public void currentapp() {
		this.currentapp = true;
	}
}


public class Desktop {
	private static List<Node> qu;

	public Desktop() {
		this.qu = new LinkedList<Node>();
		Node no = new Node("Anywhere");
		Node no1 = new Node("Chrome");
		Node no2 = new Node("Terminal");
		Node no3 = new Node("Eclipse");
		qu.add(no);
		qu.add(no1);
		qu.add(no2);
		qu.add(no3);
	}

	public void move(int o) {
		do {
			for (Node q : qu) {
				if (q.equals(qu.get(o))) {
					System.out.print(qu.get(o).toString());
					q.currentapp();
				} else {
					System.out.print(q.getApp());
					q.currentapp = false;
				}
			}
			break;
		} while (o < qu.size());
	}

	public static void main(String[] args) {
		Desktop mc = new Desktop();
		System.out.println("1. Forward Next \n2. Previous App \n3. Current App");
		Scanner output = new Scanner(System.in);
		int o = -1;
		do {
			System.out.println("\nEnter Your Operation");
			int n = output.nextInt();
			switch (n){
			case 1:
				if (n == 1) {
					o++;
					if(o>=qu.size()) {
						o=0;
					}if(o<qu.size()) {
						mc.move(o);
					}
				}
				break;
			case 2:
				if (n == 2) {
					o--;
					if(o<0) {
						o=qu.size()-1;
					}
					mc.move(o);
				}
				break;
			case 3:
				for (Node q : qu) {
					if (q.currentapp) {
						System.out.print("Current Running App"+q);
					}
				}
				break;
			default:
				System.out.println("exit");
				System.exit(0);
			}
		output.nextLine();	
		} while (true);
	}

	
}
