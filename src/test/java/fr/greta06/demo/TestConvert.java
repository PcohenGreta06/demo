package fr.greta06.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestConvert {
  @Test
  void dummyTest() {
    assert(true);
  }

  @Test
  void convertTest() {
    assertEquals("UN", Convert.convert("un"));
  }
}


