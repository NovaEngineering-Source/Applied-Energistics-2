/*
 * This file is part of Applied Energistics 2.
 * Copyright (c) 2013 - 2018, AlgorithmX2, All rights reserved.
 *
 * Applied Energistics 2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Applied Energistics 2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Applied Energistics 2.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.fluids.util;


import appeng.util.inv.InvOperation;
import net.minecraftforge.fluids.FluidStack;

@FunctionalInterface
public interface IAEFluidInventory {
    void onFluidInventoryChanged(final IAEFluidTank inv, final int slot);

    default void onFluidInventoryChanged(final IAEFluidTank inv, final int slot, InvOperation operation, FluidStack added, FluidStack removed) {
    }

    default void onFluidInventoryChanged(final IAEFluidTank inv, FluidStack added, FluidStack removed) {
    }

}
