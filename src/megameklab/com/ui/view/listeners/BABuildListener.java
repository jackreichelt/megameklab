/*
 * MegaMekLab - Copyright (C) 2017 - The MegaMek Team
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 */

package megameklab.com.ui.view.listeners;

import megamek.common.EquipmentType;

/**
 * Listener for views used by BattleArmor.
 * 
 * @author Neoancient
 *
 */
public interface BABuildListener extends BuildListener {
    void chassisTypeChanged(int bodyType);
    void weightClassChanged(int weightClass);
    void turretChanged(int type, int size);
    void exoskeletonChanged(boolean exoskeleton);
    void harjelChanged(boolean harjel);
    void squadSizeChanged(int squadSize);
    void enhancementChanged(EquipmentType eq, boolean selected);
}
