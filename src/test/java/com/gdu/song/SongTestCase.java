package com.gdu.song;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SongTestCase {

  private BufferedInputStream bis;
  
  @Before
  public void setUp() throws Exception {
    bis = new BufferedInputStream(new FileInputStream("song.mp3"));
  }
  
  @After
  public void tearDown() throws Exception {
    bis.close();
  }
  
  @Test
  public void test() throws Exception {
    
    // Do not remove!
    int songSize = 54446;
    
    // Add Code here!
    
    
  }
  
}
