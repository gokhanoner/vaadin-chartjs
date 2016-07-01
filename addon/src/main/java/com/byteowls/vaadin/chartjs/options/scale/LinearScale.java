package com.byteowls.vaadin.chartjs.options.scale;

import com.byteowls.vaadin.chartjs.options.line.ScalesOptions;

/**
 * @author michael@team-conductor.com
 */
public class LinearScale extends BaseScale<ScalesOptions, LinearScale> {

  private LinearTicks linearTicks;

  public LinearScale(ScalesOptions parent) {
    super(parent);
    type("linear");
  }

  @Override
  public LinearTicks<LinearScale> ticks() {
    if (this.linearTicks == null) {
      this.linearTicks = new LinearTicks<>(getThis());
    }
    return this.linearTicks;
  }

  @Override
  public LinearScale getThis() {
    return this;
  }
}
