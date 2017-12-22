/*
 * This file is part of Material.
 *
 * Copyright (c) 2016-2017 Neolumia
 *
 * Material is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Material is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Material. If not, see <http://www.gnu.org/licenses/>.
 */

package com.neolumia.spiget;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import com.neolumia.spiget.client.Spiget;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.Test;

public final class ResourceTest {

  private static final int RESOURCE_ID = 34523;
  private static final String RESOURCE_NAME = "AutomaticInventory";

  @Test
  public void testResource() {
    try {
      Resource resource = Spiget.getResource(String.valueOf(RESOURCE_ID)).get(5, TimeUnit.SECONDS);
      assertEquals(resource.getId(), (Integer) RESOURCE_ID);
      assertEquals(resource.getName(), RESOURCE_NAME);
    } catch (InterruptedException | ExecutionException | TimeoutException ex) {
      ex.printStackTrace();
      fail();
    }
  }
}
