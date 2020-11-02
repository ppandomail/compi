
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Nov 01 21:00:44 ART 2020
//----------------------------------------------------

package ar.edu.ub.dc.compilador_movethedot;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Nov 01 21:00:44 ART 2020
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\004\000\002\002\004\000\002\002" +
    "\005\000\002\002\006\000\002\005\010\000\002\005\012" +
    "\000\002\005\011\000\002\005\011\000\002\003\003\000" +
    "\002\003\004\000\002\004\007\000\002\004\015\000\002" +
    "\004\006\000\002\004\014\000\002\004\007\000\002\004" +
    "\015\000\002\004\007\000\002\004\015\000\002\004\006" +
    "\000\002\004\014\000\002\004\007\000\002\004\015" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\004\004\004\001\002\000\014\005\011\006" +
    "\010\007\014\010\012\015\013\001\002\000\004\002\006" +
    "\001\002\000\004\002\001\001\002\000\010\007\014\010" +
    "\012\015\013\001\002\000\004\011\101\001\002\000\004" +
    "\002\000\001\002\000\004\011\070\001\002\000\004\011" +
    "\032\001\002\000\004\011\021\001\002\000\012\005\017" +
    "\007\014\010\012\015\013\001\002\000\012\005\ufff9\007" +
    "\ufff9\010\ufff9\015\ufff9\001\002\000\004\002\uffff\001\002" +
    "\000\012\005\ufff8\007\ufff8\010\ufff8\015\ufff8\001\002\000" +
    "\010\013\023\014\022\021\024\001\002\000\004\021\030" +
    "\001\002\000\004\021\026\001\002\000\004\012\025\001" +
    "\002\000\012\005\ufff5\007\ufff5\010\ufff5\015\ufff5\001\002" +
    "\000\004\012\027\001\002\000\012\005\ufff7\007\ufff7\010" +
    "\ufff7\015\ufff7\001\002\000\004\012\031\001\002\000\012" +
    "\005\ufff3\007\ufff3\010\ufff3\015\ufff3\001\002\000\004\021" +
    "\033\001\002\000\004\012\034\001\002\000\004\016\035" +
    "\001\002\000\006\007\037\010\036\001\002\000\004\011" +
    "\054\001\002\000\004\011\040\001\002\000\010\013\042" +
    "\014\041\021\043\001\002\000\004\021\051\001\002\000" +
    "\004\021\046\001\002\000\004\012\044\001\002\000\004" +
    "\017\045\001\002\000\012\005\ufff4\007\ufff4\010\ufff4\015" +
    "\ufff4\001\002\000\004\012\047\001\002\000\004\017\050" +
    "\001\002\000\012\005\ufff6\007\ufff6\010\ufff6\015\ufff6\001" +
    "\002\000\004\012\052\001\002\000\004\017\053\001\002" +
    "\000\012\005\ufff2\007\ufff2\010\ufff2\015\ufff2\001\002\000" +
    "\010\013\056\014\055\021\057\001\002\000\004\021\065" +
    "\001\002\000\004\021\062\001\002\000\004\012\060\001" +
    "\002\000\004\017\061\001\002\000\012\005\uffee\007\uffee" +
    "\010\uffee\015\uffee\001\002\000\004\012\063\001\002\000" +
    "\004\017\064\001\002\000\012\005\ufff0\007\ufff0\010\ufff0" +
    "\015\ufff0\001\002\000\004\012\066\001\002\000\004\017" +
    "\067\001\002\000\012\005\uffec\007\uffec\010\uffec\015\uffec" +
    "\001\002\000\010\013\072\014\071\021\073\001\002\000" +
    "\004\021\077\001\002\000\004\021\075\001\002\000\004" +
    "\012\074\001\002\000\012\005\uffef\007\uffef\010\uffef\015" +
    "\uffef\001\002\000\004\012\076\001\002\000\012\005\ufff1" +
    "\007\ufff1\010\ufff1\015\ufff1\001\002\000\004\012\100\001" +
    "\002\000\012\005\uffed\007\uffed\010\uffed\015\uffed\001\002" +
    "\000\006\014\102\021\103\001\002\000\004\021\112\001" +
    "\002\000\004\020\104\001\002\000\006\014\105\021\106" +
    "\001\002\000\004\021\110\001\002\000\004\012\107\001" +
    "\002\000\010\007\ufffd\010\ufffd\015\ufffd\001\002\000\004" +
    "\012\111\001\002\000\010\007\ufffa\010\ufffa\015\ufffa\001" +
    "\002\000\004\020\113\001\002\000\006\014\114\021\115" +
    "\001\002\000\004\021\117\001\002\000\004\012\116\001" +
    "\002\000\010\007\ufffb\010\ufffb\015\ufffb\001\002\000\004" +
    "\012\120\001\002\000\010\007\ufffc\010\ufffc\015\ufffc\001" +
    "\002\000\012\005\122\007\014\010\012\015\013\001\002" +
    "\000\004\002\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\004\002\004\001\001\000\010\003\014\004" +
    "\015\005\006\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\003\120\004\015\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\017\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\017\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {

 static int x = 0;  
			   static int y = 0; 
			   
			   public static void locate_it(int xx, int yy) {
			       x = xx;
			       y = yy;
			   }
			   			   
			   public static void move_it(int xx, int yy) {
			       x += xx;
			       y += yy;
			   }
			   
			   public static void show_it() {
			   		System.out.println("Finaliza en x:" + x + ", y:" + y);
			   		System.out.println("Fin de ejecución.");
			   }	

  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // LINEAS ::= REPETIR PAR_A ENTERO PAR_C COR_A LATERAL PAR_A RESTA ENTERO PAR_C COR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 
			for (int i = 0; i < n1; i++) {
			System.out.println("Rep("+i+")-> Izquierda: "+n2.intValue());
			move_it(-n2.intValue(),0);
			} 
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // LINEAS ::= LATERAL PAR_A RESTA ENTERO PAR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
		  System.out.println("Izquierda: "+n1.intValue());
		  move_it(-n1.intValue(),0); 
		  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // LINEAS ::= REPETIR PAR_A ENTERO PAR_C COR_A LATERAL PAR_A ENTERO PAR_C COR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 
			for (int i = 0; i < n1; i++) {
			System.out.println("Rep("+i+")-> Derecha: "+n2.intValue());
			move_it(n2.intValue(),0);
			} 
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // LINEAS ::= LATERAL PAR_A ENTERO PAR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
          System.out.println("Derecha: "+n1.intValue());
          move_it(n1.intValue(),0); 
          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // LINEAS ::= REPETIR PAR_A ENTERO PAR_C COR_A LATERAL PAR_A SUMA ENTERO PAR_C COR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 
			for (int i = 0; i < n1; i++) {
			System.out.println("Rep("+i+")-> Derecha: "+n2.intValue());
			move_it(n2.intValue(),0);
			} 
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // LINEAS ::= LATERAL PAR_A SUMA ENTERO PAR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
          System.out.println("Derecha: "+n1.intValue());
          move_it(n1.intValue(),0); 
          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // LINEAS ::= REPETIR PAR_A ENTERO PAR_C COR_A VERTICAL PAR_A RESTA ENTERO PAR_C COR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 
			for (int i = 0; i < n1; i++) {
			System.out.println("Rep("+i+")-> Baja: "+n2.intValue());
			move_it(0,-n2.intValue());
			} 
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // LINEAS ::= VERTICAL PAR_A RESTA ENTERO PAR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 
	 	System.out.println("Baja: "+n1.intValue());
		  move_it(0,-n1.intValue()); 
		  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // LINEAS ::= REPETIR PAR_A ENTERO PAR_C COR_A VERTICAL PAR_A ENTERO PAR_C COR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 
			for (int i = 0; i < n1; i++) {
			System.out.println("Rep("+i+")-> Sube: "+n2.intValue());
			move_it(0,n2.intValue());
			} 
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // LINEAS ::= VERTICAL PAR_A ENTERO PAR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
		 System.out.println("Sube: "+n1.intValue());
		 move_it(0,n1.intValue());
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // LINEAS ::= REPETIR PAR_A ENTERO PAR_C COR_A VERTICAL PAR_A SUMA ENTERO PAR_C COR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 
			for (int i = 0; i < n1; i++) {
			System.out.println("Rep("+i+")-> Sube: "+n2.intValue());
			move_it(0,n2.intValue());
			} 
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // LINEAS ::= VERTICAL PAR_A SUMA ENTERO PAR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
		 System.out.println("Sube: "+n1.intValue());
		 move_it(0,n1.intValue());
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEAS",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CUERPO ::= CUERPO LINEAS 
            {
              Object RESULT =null;
		  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CUERPO ::= LINEAS 
            {
              Object RESULT =null;
		  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LINEA1 ::= UBICAR PAR_A ENTERO COMA RESTA ENTERO PAR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
		 System.out.println("Se ubica en x:"+n1.intValue()+", y:-"+n2.intValue());
		 locate_it(n1.intValue(),-n2.intValue());
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEA1",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // LINEA1 ::= UBICAR PAR_A RESTA ENTERO COMA ENTERO PAR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
		 System.out.println("Se ubica en x:-"+n1.intValue()+", y:"+n2.intValue());
		 locate_it(-n1.intValue(),n2.intValue());
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEA1",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // LINEA1 ::= UBICAR PAR_A RESTA ENTERO COMA RESTA ENTERO PAR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
		 System.out.println("Se ubica en x:-"+n1.intValue()+", y:-"+n2.intValue());
		 locate_it(-n1.intValue(),-n2.intValue());
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEA1",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // LINEA1 ::= UBICAR PAR_A ENTERO COMA ENTERO PAR_C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
		 System.out.println("Se ubica en x:"+n1.intValue()+", y:"+n2.intValue());
		 locate_it(n1.intValue(),n2.intValue());
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINEA1",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // PROGRAMA ::= INICIO LINEA1 CUERPO FIN 
            {
              Object RESULT =null;
		 show_it(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // PROGRAMA ::= INICIO CUERPO FIN 
            {
              Object RESULT =null;
		 show_it(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROGRAMA ::= INICIO FIN 
            {
              Object RESULT =null;
		 
	    System.out.println("Programa vacio");
	    show_it(); 
	    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROGRAMA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

