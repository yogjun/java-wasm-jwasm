package com.yogjun;

import de.inetsoftware.jwebassembly.api.annotation.Export;
import de.inetsoftware.jwebassembly.web.JSObject;

/**
 * {@link MathUtil}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2024/8/6
 */
public class MathUtil {

  @Export
  public static int add(int a, int b) {
    return a + b;
  }

  @Export
  public static int sub(int a, int b) {
    return a - b;
  }

  @Export
  public static Object printSource(Object o) {

    return o;
  }

  @Export
  public static int printSource2(InputCla o) {
    return o.getA()+o.getB();
  }
}
