package TermProject350;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FloydWarshallMain {

	public static void main(String[] args) throws FileNotFoundException {
		String answer = "y";
		
		ArrayList<String> vertices;
		ArrayList<Edge> edges;
		
		System.out.println("Enter your directory of vertices and edges (i.e. name.txt)");
		Scanner scan = new Scanner(System.in);
		String textfile = scan.next();
		Scanner read = new Scanner(new FileReader(textfile));
		Scanner firstLine = new Scanner(read.nextLine());
			
		//adding vertices into the ArrayList from the first line of the text file
		while(firstLine.hasNext()){
			vertices.add(firstLine.next());
		}
		
		while(read.hasNextLine()){
			Scanner nextLine = new Scanner(read.nextLine());
			String vertexP;
			String vertexC;
			String time;
				
			vertexP = nextLine.next();				
			time = nextLine.next();
			vertexC = nextLine.next();
			double t = Double.parseDouble(time);
			
			Edge edge(vertexP, vertexC, t);
			edges.add(edge);	
			
		}
	}

}
