import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class d extends  Dialog implements ActionListener
{Button k=new Button("Cancel");
	public d(Frame h,String msg)
	{super(h,msg,true);
setLayout(new BorderLayout());	
	setSize(250,250);
k.addActionListener(this);
		add(k,BorderLayout.CENTER);}
		public void actionPerformed(ActionEvent e)
	{setVisible(false);}
}

class shape extends Dialog implements ItemListener
{CheckboxGroup x=new CheckboxGroup();
		Checkbox q=new Checkbox("Oval",x,false);
	Checkbox r=new Checkbox("Rectangle",x,false);
	Checkbox l=new Checkbox("Line",x,false);
String z="";
	shape(Frame h,String m)
		{
			super(h,m,true);
			setSize(600,600);
			setLayout(new FlowLayout(FlowLayout.LEFT));
			q.addItemListener(this);
			r.addItemListener(this);
			l.addItemListener(this);
			add(q);
			add(r);
			cl wi=new cl();
			addWindowListener(wi);
			add(l);}
			public void itemStateChanged(ItemEvent h)
			{z=x.getSelectedCheckbox().getLabel();
				repaint();
			}
			public void paint(Graphics g)
			{
				if(z.equals("Oval"))
					g.fillOval(80,90,100,110);
				if(z.equals("Rectangle"))
					g.fillRect(80,90,100,110);
				if(z.equals("Line"))
					g.drawLine(80,90,100,110);}
				class cl extends WindowAdapter
				{
					public void windowClosing(WindowEvent n)
					{
						setVisible(false);}}}

public class note_12 extends Frame implements ActionListener
{
	int x=50;
	int y=100;
String msg="";
String msg2="";
public note_12(){}
public note_12(String msg1)
{
super(msg1);
setLayout(new BorderLayout());
MenuBar k=new MenuBar();
setMenuBar(k);
Menu f=new Menu("File");
Menu e=new Menu("Edit");
Menu v=new Menu("View");
MenuItem s=new MenuItem("NewWindow");
f.add(s);
MenuItem n=new MenuItem("NewFile");
f.add(n);
MenuItem c=new MenuItem("Quit");
f.add(c);
k.add(f);
MenuItem sh=new MenuItem("Shape");
v.add(sh);
MenuItem ma=new MenuItem("Maximize");
MenuItem mi=new MenuItem("Minimize Size");
e.add(ma);
e.add(mi);
k.add(e);
k.add(v);
Menu T=new Menu("Text Specificatiions");
Menu C=new Menu("Colour");
Menu FS=new Menu("Font Style");
MenuItem R,Cy,B,Bl,P,O;
C.add(R=new MenuItem("Red"));
C.add(Cy=new MenuItem("Cyan"));
C.add(B=new MenuItem("Blue"));
C.add(Bl=new MenuItem("Black"));
C.add(P=new MenuItem("Pink"));
C.add(O=new MenuItem("Orange"));
T.add(C);
Menu F=new Menu("Font");
MenuItem cl,ar,tr,ce;
F.add(cl=new MenuItem("Calibri"));
F.add(ar=new MenuItem("Arial"));
F.add(tr=new MenuItem("Times New Roman"));
F.add(ce=new MenuItem("Century"));
T.add(F);
MenuItem Bo,It,Bi,Pl;
FS.add(Bo=new MenuItem("Bold"));
FS.add(It=new MenuItem("Italics"));
FS.add(Bi=new MenuItem("Bold Italics"));
FS.add(Pl=new MenuItem("Plain"));
T.add(FS);
k.add(T);
Menu si=new Menu("Size");
MenuItem s1,s2,s3,s4,s5,s6,s7,s8;
si.add(s1=new MenuItem("14"));
si.add(s2=new MenuItem("16"));
si.add(s3=new MenuItem("20"));
si.add(s4=new MenuItem("22"));
si.add(s5=new MenuItem("24"));
si.add(s6=new MenuItem("26"));
si.add(s7=new MenuItem("28"));
si.add(s8=new MenuItem("30"));
k.add(si);
Menu Z=new Menu("Zoom");
Menu Zin=new Menu("Zoom In");
Z.add(Zin);
MenuItem Zout=new MenuItem("Zoom Out");
Z.add(Zout);
MenuItem x2=new MenuItem("2X");
MenuItem x3=new MenuItem("3X");
Zin.add(x2);
Zin.add(x3);
v.add(Z);
ce.addActionListener(this);
sh.addActionListener(this);
x2.addActionListener(this);
x3.addActionListener(this);
Zout.addActionListener(this);
ma.addActionListener(this);
mi.addActionListener(this);
s.addActionListener(this);
n.addActionListener(this);
c.addActionListener(this);
R.addActionListener(this);
Cy.addActionListener(this);
B.addActionListener(this);
Bl.addActionListener(this);
Pl.addActionListener(this);
P.addActionListener(this);
O.addActionListener(this);
cl.addActionListener(this);
ar.addActionListener(this);
tr.addActionListener(this);
Bo.addActionListener(this);
It.addActionListener(this);
Bi.addActionListener(this);
s1.addActionListener(this);
s2.addActionListener(this);
s3.addActionListener(this);
s4.addActionListener(this);
s5.addActionListener(this);
s6.addActionListener(this);
s7.addActionListener(this);
s8.addActionListener(this);
wadapter j=new wadapter();
addWindowListener(j);
kadapter b=new kadapter();
addKeyListener(b);	
}

public void actionPerformed(ActionEvent k)
{String temp="";
	note_12 l=new note_12();
	msg2=k.getActionCommand();
	if(msg2.equals("NewFile"))
	{FileDialog m=new FileDialog(l,"FileDialog");
m.setVisible(true);}
	if(msg2.equals("NewWindow"))
	{
		d g=new d(l,"Anonymus");
		g.setVisible(true);}
	if(msg2.equals("Quit"))
		setVisible(false);
	if(msg2.equals("Shape"))
	{
		shape m=new shape(l,"Shape window");
		m.setVisible(true);
	}
	if(msg2.equals("Maximize"))
		setSize(1500,1500);
	if(msg2.equals("Minimize Size"))
		setSize(500,500);
	if(msg2.equals("Arial")){
		Font ai=new Font("Arial",Font.PLAIN,12);
	setFont(ai);
	temp=msg2;}
	if(msg2.equals("Calibri")){
		Font ci=new Font("Calibri",Font.PLAIN,12);
	setFont(ci);
	temp=msg2;}
	if(msg2.equals("Times New Roman")){
		Font ti=new Font("Times New Roman",Font.PLAIN,12);
	setFont(ti);
	temp=msg2;}
	if(msg2.equals("Century")){
		Font xe=new Font("Century",Font.PLAIN,12);
	setFont(xe);
	temp=msg2;}
	if(msg2.equals("Bold"))
	{Font ai=new Font("Arial",Font.BOLD,12);
	setFont(ai);}
	if(msg2.equals("Italics"))
	{Font ai=new Font("Arial",Font.ITALIC,12);
	setFont(ai);}
	if(msg2.equals("Plain"))
	{Font ai=new Font("Arial",Font.PLAIN,12);
	setFont(ai);}
	if(msg2.equals("Bold Italics"))
	{Font ai=new Font("Arial",Font.BOLD|Font.ITALIC,12);
	setFont(ai);}
	if(msg2.equals("14"))
	{
		Font gh=new Font("Arial",Font.PLAIN,14);
		setFont(gh);}
		if(msg2.equals("16"))
	{
		Font gh=new Font("Arial",Font.PLAIN,16);
		setFont(gh);
	}
	if(msg2.equals("18"))
	{
		Font gh=new Font("Arial",Font.PLAIN,18);
		setFont(gh);
	}
	if(msg2.equals("20"))
	{
		Font gh=new Font("Arial",Font.PLAIN,20);
		setFont(gh);
	}
	if(msg2.equals("22"))
	{
		Font gh=new Font("Arial",Font.PLAIN,22);
		setFont(gh);
	}
	if(msg2.equals("24"))
	{
		Font gh=new Font("Arial",Font.PLAIN,24);
		setFont(gh);
	}
	if(msg2.equals("26"))
	{
		Font gh=new Font("Arial",Font.PLAIN,26);
		setFont(gh);
	}
	if(msg2.equals("28"))
	{
		Font gh=new Font("Arial",Font.PLAIN,28);
		setFont(gh);
	}
	if(msg2.equals("30"))
	{
		Font gh=new Font("Arial",Font.PLAIN,30);
		setFont(gh);
	}
	if(msg2.equals("2X"))
	{
		Font gh=new Font("Arial",Font.PLAIN,18);
		setFont(gh);
	}
	if(msg2.equals("3X"))
	{
		Font gh=new Font("Arial",Font.PLAIN,24);
		setFont(gh);
	}
	if(msg2.equals("Zoom Out"))
	{
		Font gh=new Font("Arial",Font.PLAIN,12);
		setFont(gh);
	}
}

class kadapter extends KeyAdapter{
public void keyTyped(KeyEvent w)
{  
   msg+=w.getKeyChar();
   repaint();
}
public void keyPressed(KeyEvent f)
{
	int key=f.getKeyCode();
	switch(key)
	{
		case KeyEvent.VK_UP:
		msg+="<UP>";
		break;
		case KeyEvent.VK_DOWN:
		msg+="<DOWN>";
		break;
		case KeyEvent.VK_LEFT:
		msg+="<LEFT>";
		break;
		case KeyEvent.VK_RIGHT:
		msg+="<RIGHT>";
		break;
		case KeyEvent.VK_F1:
		msg+="<F1>";
		break;
		case KeyEvent.VK_F2:
		msg+="<F2>";
		break;
		case KeyEvent.VK_F3:
		msg+="<F3>";
		break;
		case KeyEvent.VK_F4:
		msg+="<F4>";
		break;
		case KeyEvent.VK_F5:
		msg+="<F5>";
		break;
		case KeyEvent.VK_F6:
		msg+="<F6>";
		break;
		case KeyEvent.VK_F7:
		msg+="<F7>";
		break;
		case KeyEvent.VK_F8:
		msg+="<F8>";
		break;
		case KeyEvent.VK_F9:
		msg+="<F9>";
		break;
		case KeyEvent.VK_F10:
		msg+="<F10>";
		break;
		case KeyEvent.VK_CONTROL:
		msg+="<CTRL>";
		break;
		case KeyEvent.VK_ALT:
		msg+="<ALT>";
		break;
		case KeyEvent.VK_ESCAPE:
	System.exit(0);}
		//case KeyEvent.VK_ENTER:}
repaint();
}}
	public void paint(Graphics g)
	{
	if(msg2.equals("Red"))
		g.setColor(Color.red);
	if(msg2.equals("Cyan"))
		g.setColor(Color.cyan);
	if(msg2.equals("Orange"))
		g.setColor(Color.orange);
	if(msg2.equals("Pink"))
		g.setColor(Color.pink);
	if(msg2.equals("Black"))
		g.setColor(Color.black);
	if(msg2.equals("Blue"))
		g.setColor(Color.blue);
	g.drawString(msg,x,y);}
public static void main(String args[])
{
	Frame m=new note_12("My Notepad:)");
	m.setSize(1000,1000);
	m.setVisible(true);
}

class wadapter extends WindowAdapter
{
	public void windowClosing(WindowEvent r)
	{
		System.exit(0);
}}
}
