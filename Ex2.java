package javareflectionlistaex2;
import java.lang.reflect.*;
import java.util.Arrays;

public class Reflection {
    
public Class cl = Aluno.class;
    
   // Aluno myAluno = new Aluno("Rubens", 3024121, "SPO", "TDAS", 6);
    
    Aluno myAluno = new Aluno("Rubens", 0000000, null, null, 0);
    
    public void nomeClasse()
        {
		try {
                        
			//Class cl = Class.forName("javareflectionlistaex1.Aluno");
			String className = cl.getName();
                        String className2 = cl.getSimpleName();
                        System.out.println("Nome da classe: "+ className +"\n");
                        System.out.println("Nome da classe: "+ className2 +"\n");
		} catch (Throwable e) {
			System.err.print(e);
		}
	}

   public void tipoClasse()
   {
       int classType = cl.getModifiers();
       System.out.println("Abstract ? "+Modifier.isAbstract(classType));
       System.out.println("Interface ? "+ Modifier.isInterface(classType));
       System.out.println("Private ? "+ Modifier.isPrivate(classType));
       System.out.println("Public ? "+ Modifier.isPublic(classType));
       System.out.println("Protected ? "+ Modifier.isProtected(classType));
       System.out.println("Static ? "+ Modifier.isStatic(classType));
       System.out.println("Final ? "+ Modifier.isFinal(classType));
       System.out.println("Native ? "+ Modifier.isNative(classType));
       System.out.println("Strict ? "+ Modifier.isStrict(classType));
       System.out.println("Synchonized ? "+Modifier.isSynchronized(classType));
       System.out.println("Transient ? "+Modifier.isTransient(classType));
       System.out.println("Volatile ?"+Modifier.isVolatile(classType));
       
     
   }
      
   public void metodosClasse()
   {
       Method[] classMethods = cl.getMethods();
       for (Method myMethod : classMethods)
       {
           System.out.println("Nome metodo: " +myMethod.getName() +"");
           if(myMethod.getName().startsWith("get"))
           {    System.out.println("metodo getter ");
           
           }
           else if (myMethod.getName().startsWith("set"))
           {
               System.out.println("metodo setter ");
           }
           System.out.println("tipo de retorno: "+ myMethod.getReturnType() +"\n");
           Class [] parameterType = myMethod.getParameterTypes();
           System.out.println("Parametro");
           for(Class myParameter : parameterType)
           {
               System.out.println(myParameter.getName());
           }
           //System.out.println();
       }   
   }
   
  
   public void updateName() throws Exception
   {    
       
       System.out.println("Current Name: "+ myAluno.getNome());
       // System.out.println("Curren name: "+ this);
       Field nameField = cl.getDeclaredField("nome");
       
       //Field nameField = myAluno.getClass().getDeclaredField("nome");
       nameField.setAccessible(true);
       
       //String nameUpdate = "Rubens Henrique N Lotufo";
       nameField.set(myAluno, "Rubens Henrique N Lotufo");
       nameField.setAccessible(false);
       
       System.out.println("Name Update: "+ myAluno.getNome());
       
       
       
       //Assertions.assertEquals(nameUpdate, myAluno.getNome());
   
       
   }
   
   
   public void invocaMetodos() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
       
       Class classToLoad = Class.forName("javareflectionlistaex1.Aluno");
       Class[] cArg = new Class[5];
       
        cArg[0] = String.class; 
        cArg[1] = int.class; 
        cArg[2] = String.class; 
        cArg[3] = String.class; 
        cArg[4] = int.class; 
        
        
        String s = "Rubens Henrique N L";
        int p = 1234567;
        String s2 = "SPO2";
        String s3 ="TDAS2";
        int sem = 1;
        
        
        
        
        Field[] fi = classToLoad.getDeclaredFields();
        
        
        
       classToLoad.getDeclaredConstructor(cArg).newInstance(s, p, s2,s3,sem);
       
      
      

	}
   
   
   
   
   
}
