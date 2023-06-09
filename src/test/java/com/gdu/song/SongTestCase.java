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
  public void 파일읽기테스트() throws Exception {
    
    // 사용할 변수
    int songSize = 54446;
    
    // 코드를 추가할 영역
    
    
  }
  
}
