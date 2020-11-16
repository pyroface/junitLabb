package se.iths;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TextProcessorTest {

  @BeforeAll
  public static void testBeforeAll(){
    System.out.printf("Running test\n");
  }

  @Test
  void testString() {
    TextProcessor textProcessor = new TextProcessor();
    assertNotNull(textProcessor);
  }

  @Test
  void testLowerCase(){
    TextProcessor textProcessor = new TextProcessor();
    assertEquals("test", textProcessor.lowerCase("TEST") );
    System.out.println("Test lower case");
  }
  @Test
  void testUpperCase(){
    TextProcessor textProcessor = new TextProcessor();
    assertEquals("TEST", textProcessor.upperCase("test") );
    System.out.println("Test upper case");
  }

  @Test
  void testReverseText(){
    TextProcessor textProcessor = new TextProcessor();
    assertEquals("tseT", textProcessor.reverseText("Test") );
    System.out.println("Test reverse text");
  }

  @AfterAll
  public static void testAfterAll(){
    System.out.printf("Testing complete\n");
  }

}

