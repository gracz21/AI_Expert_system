package com.sample;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import com.sample.MainWindow;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        MainWindow.main(null);
        try {
            // load up the knowledge base
            KnowledgeBase kbase = readKnowledgeBase();
            StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
            KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
            // release MainWindow lock here
            synchronized (MainWindow.instance())
            {
                MainWindow.instance().notifyAll();
            }
            ksession.fireAllRules();
            logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static KnowledgeBase readKnowledgeBase() throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("Sample.drl"), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }

    public static class Pozycja {
    	public int value;
    	
    	public Pozycja(int v) {
    		value = v;
    	}
    }
    
    public static class Ego {
    	public int value;
    	
    	public Ego(int v) {
    		value = v;
    	}
    	
    }
    
    public static class Agresja {
    	public int value;
    	
    	public Agresja(int v) {
    		value = v;
    	}
    }
    
    public static class Zel {
    	public int value;
    	
    	public Zel(int v) {
    		value = v;
    	}
    }
    
    public static class Nurkowanie {
    	public boolean value;
    	
    	public Nurkowanie(boolean v) {
    		value = v;
    	}
    }
    
    public static class Wypady {
    	public boolean value;
    	
    	public Wypady(boolean v) {
    		value = v;
    	}
    }
    
    public static class Szczescie {
    	public int value;
    	
    	public Szczescie(int v) {
    		value = v;
    	}
    }
    
    public static class Wzrost {
    	public int value;
    	
    	public Wzrost(int v) {
    		value = v;
    	}
    }
    
    public static class Wiek {
    	public int value;
    	
    	public Wiek(int v) {
    		value = v;
    	}
    }
    
    public static class Banany {
    	public boolean value;
    	
    	public Banany(boolean v) {
    		value = v;
    	}
    }
    
    public static class Taktyka {
    	public int value;
    	
    	public Taktyka(int v) {
    		value = v;
    	}
    }
    
    public static class Imprezy {
    	public boolean value;
    	
    	public Imprezy(boolean v) {
    		value = v;
    	}
    }
    
    public static class Lider {
    	public boolean value;
    	
    	public Lider(boolean v) {
    		value = v;
    	}
    }
    
    public static class Podejscie {
    	public int value;
    	
    	public Podejscie(int v) {
    		value = v;
    	}
    }
    
    public static class Ogrodnik {
    	public boolean value;
    	
    	public Ogrodnik(boolean v) {
    		value = v;
    	}
    }
    
    public static class Broda {
    	public boolean value;
    	
    	public Broda(boolean v) {
    		value = v;
    	}
    }
    
    public static class Zaimponowanie {
    	public boolean value;
    	
    	public Zaimponowanie(boolean v) {
    		value = v;
    	}
    }
    
    public static class Samolubnosc {
    	public int value;
    	
    	public Samolubnosc(int v) {
    		value = v;
    	}
    }
    
    public static class Chipsy {
    	public boolean value;
    	
    	public Chipsy(boolean v) {
    		value = v;
    	}
    }
    
    public static class Gryzienie {
    	public boolean value;
    	
    	public Gryzienie(boolean v) {
    		value = v;
    	}
    }
}
