package application;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.w3c.dom.events.EventException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	String course1=" ";
	String course2=" ";
	String course3=" ";
	String course4=" ";
	String course5=" ";
	int credit1;
	int credit2;
	int credit3;
	int credit4;
	int credit5;
	String grade1=" ";
	String grade2=" ";
	String grade3=" ";
	String grade4=" ";
	String grade5=" ";
	@Override
	public void start(Stage primaryStage) {
		
		//UI elements
		Label name=new Label("Name: ");
		Label id=new Label("ID: ");
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		Label lb1=new Label("Course 1: ");
		Label lb2=new Label("Course 2: ");
		Label lb3=new Label("Course 3: ");
		Label lb4=new Label("Course 4: ");
		Label lb5=new Label("Course 5: ");
		
		ComboBox<String> com1=new ComboBox<>();
		com1.getItems().addAll("CSE115","CSE115L","CSE173","CSE215","CSE215L","CSE225","CSE225L","CSE231","CSE231L","CSE299","CSE332","CSE311","CSE311L","CSE323","CSE373","CSE327","CSE331","CSE331L","CSE425","CSE1499A","CSE499B");
		com1.setPromptText("Select Course");
		
		com1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				course1=com1.getValue();
			}
		});
		
		ComboBox<String> com2=new ComboBox<>();
		com2.getItems().addAll("CSE115","CSE115L","CSE173","CSE215","CSE215L","CSE225","CSE225L","CSE231","CSE231L","CSE299","CSE332","CSE311","CSE311L","CSE323","CSE373","CSE327","CSE331","CSE331L","CSE425","CSE1499A","CSE499B");
		com2.setPromptText("Select Course");
		
		com2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				course2=com2.getValue();
			}
		});
		
		ComboBox<String> com3=new ComboBox<>();
		com3.getItems().addAll("CSE115","CSE115L","CSE173","CSE215","CSE215L","CSE225","CSE225L","CSE231","CSE231L","CSE299","CSE332","CSE311","CSE311L","CSE323","CSE373","CSE327","CSE331","CSE331L","CSE425","CSE1499A","CSE499B");
		com3.setPromptText("Select Course");
		
		com3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				course3=com3.getValue();
			}
		});
		
		ComboBox<String> com4=new ComboBox<>();
		com4.getItems().addAll("CSE115","CSE115L","CSE173","CSE215","CSE215L","CSE225","CSE225L","CSE231","CSE231L","CSE299","CSE332","CSE311","CSE311L","CSE323","CSE373","CSE327","CSE331","CSE331L","CSE425","CSE1499A","CSE499B");
		com4.setPromptText("Select Course");
		
		com4.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				course4=com4.getValue();
			}
		});
		
		ComboBox<String> com5=new ComboBox<>();
		com5.getItems().addAll("CSE115","CSE115L","CSE173","CSE215","CSE215L","CSE225","CSE225L","CSE231","CSE231L","CSE299","CSE332","CSE311","CSE311L","CSE323","CSE373","CSE327","CSE331","CSE331L","CSE425","CSE1499A","CSE499B");
		com5.setPromptText("Select Course");
		
		com5.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				course5=com5.getValue();
			}
		});
		
		ComboBox<Integer> com6=new ComboBox<>();
		com6.getItems().addAll(3,1);
		com6.setPromptText("Select Credit");
		
		com6.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				credit1=com6.getValue();
			}
		});
		
		ComboBox<Integer> com7=new ComboBox<>();
		com7.getItems().addAll(3,1);
		com7.setPromptText("Select Credit");
		
		com7.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				credit2=com7.getValue();
			}
		});
		
		ComboBox<Integer> com8=new ComboBox<>();
		com8.getItems().addAll(3,1);
		com8.setPromptText("Select Credit");
		
		com8.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				credit3=com8.getValue();
			}
		});
		
		ComboBox<Integer> com9=new ComboBox<>();
		com9.getItems().addAll(3,1);
		com9.setPromptText("Select Credit");
		
		com9.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				credit4=com9.getValue();
			}
		});
		
		ComboBox<Integer> com10=new ComboBox<>();
		com10.getItems().addAll(3,1);
		com10.setPromptText("Select Credit");
		
		com10.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				credit5=com10.getValue();
			}
		});
		
		ComboBox<String> com11=new ComboBox<>();
		com11.getItems().addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","F");
		com11.setPromptText("Select Grade");
		
		com11.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				grade1=com11.getValue();
			}
		});
		
		ComboBox<String> com12=new ComboBox<>();
		com12.getItems().addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","F");
		com12.setPromptText("Select Grade");
		
		com12.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				grade2=com12.getValue();
			}
		});
		
		ComboBox<String> com13=new ComboBox<>();
		com13.getItems().addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","F");
		com13.setPromptText("Select Grade");
		
		com13.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				grade3=com13.getValue();
			}
		});
		
		ComboBox<String> com14=new ComboBox<>();
		com14.getItems().addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","F");
		com14.setPromptText("Select Grade");
		
		com14.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				grade4=com14.getValue();
			}
		});
		
		ComboBox<String> com15=new ComboBox<>();
		com15.getItems().addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","F");
		com15.setPromptText("Select Grade");
		
		com15.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				grade5=com15.getValue();
			}
		});
		
		Button Calculate=new Button("Calculate");
		
		Calculate.setOnAction(new EventHandler<ActionEvent>() {
			double gp;
			@Override
			public void handle(ActionEvent event) {
				
				String name=tf1.getText().toString();
				String id=tf2.getText().toString();
				
				String course1=com1.getValue();
				String course2=com2.getValue();
				String course3=com3.getValue();
				String course4=com4.getValue();
				String course5=com5.getValue();
				
				int cr1=com6.getValue();
				int cr2=com7.getValue();
				int cr3=com8.getValue();
				int cr4=com9.getValue();
				int cr5=com10.getValue();
				
				String gr1=com11.getValue();
				String gr2=com12.getValue();
				String gr3=com13.getValue();
				String gr4=com14.getValue();
				String gr5=com15.getValue();
				
				//grade calculation
				if(gr1=="A") {
					gp=4.00;
				}
				else if(gr1=="A-") {
					gp=3.7; 
				}
				else if(gr1=="B+") {
					gp=3.3; 
				}
				else if(gr1=="B") {
					gp=3.0; 
				}
				else if(gr1=="B-") {
					gp=2.7; 
				}
				else if(gr1=="C+") {
					gp=2.3; 
				}
				else if(gr1=="C") {
					gp=2.0; 
				}
				else if(gr1=="C-") {
					gp=1.7; 
				}
				else if(gr1=="D+") {
					gp=1.3; 
				}
				else if(gr1=="D") {
					gp=1.0; 
				}
				else if(gr1=="F") {
					gp=0.0; 
				}
				else 
					System.out.println("Default");
				
				double gpa1=gp*cr1;
				double gpa2=gp*cr2;
				double gpa3=gp*cr3;
				double gpa4=gp*cr4;
				double gpa5=gp*cr5;
				
				double CGPA=(gpa1+gpa2+gpa3+gpa4+gpa5)/(cr1+cr2+cr3+cr4+cr5);
				
				File obj=new File("Cgpa.txt");
				try {
					obj.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					FileWriter fw=new FileWriter("Cgpa.txt");
					fw.write(name+" "+id+"\n");
					fw.write(course1+" "+cr1+" "+gr1+"\n");
					fw.write(course2+" "+cr2+" "+gr2+"\n");
					fw.write(course3+" "+cr3+" "+gr3+"\n");
					fw.write(course4+" "+cr4+" "+gr4+"\n");
					fw.write(course5+" "+cr5+" "+gr5+"\n");
					//fw.write((int) CGPA);
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				Alert al=new Alert(AlertType.CONFIRMATION);
				al.setContentText(String.valueOf(CGPA));
				al.setTitle("CGPA");
				al.show();
				
				Button show=new Button("show");
				
				show.setOnAction(new EventHandler<ActionEvent>() {
					String data=" ";
					@Override
					public void handle(ActionEvent event) {
					
						try {
							FileReader fr=new FileReader("Cgpa.txt");
							Scanner sc=new Scanner(fr);
							while(sc.hasNextLine()) {
								data=sc.nextLine();
							}
							
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}	
						
						Label lb=new Label(data);
						HBox hb=new HBox(10,lb);
						hb.setAlignment(Pos.CENTER);
						
						Scene sc=new Scene(hb,400,400);
						
						primaryStage.setTitle("showing");
						primaryStage.setScene(sc);
						primaryStage.show();
					}
				});
				
				VBox vb=new VBox(show);
				Scene sc=new Scene(vb,400,400);
				
				primaryStage.setTitle("Calculator");
				primaryStage.setScene(sc);
				primaryStage.show();
				
			}
			
		});
		
		
		//layout
		HBox hb1=new HBox(10, name,tf1);
		HBox hb2=new HBox(10, id,tf2);
		HBox hb3=new HBox(10, lb1,com1,com6,com11);
		HBox hb4=new HBox(10, lb2,com2,com7,com12);
		HBox hb5=new HBox(10, lb3,com3,com8,com13);
		HBox hb6=new HBox(10, lb4,com4,com9,com14);
		HBox hb7=new HBox(10, lb5,com5,com10,com15);
		
		VBox vb1=new VBox(10, hb1,hb2,hb3,hb4,hb5,hb6,hb7,Calculate);
		//scene
		Scene sc=new Scene(vb1,500,400);
		//stage
		primaryStage.setTitle("CGPA Calculator");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
