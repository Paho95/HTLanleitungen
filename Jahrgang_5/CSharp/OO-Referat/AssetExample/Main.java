/************************************************************************
 * Copyright (C) 2015 Richard Bäck <richard.baeck@openmailbox.org>
 *
 * This file is part of AssetExample.
 *
 * AssetExample is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AssetExample is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AssetExample.  If not, see <http://www.gnu.org/licenses/>.
 ***********************************************************************/

public class Main {
    public static void main(String[] args) {
        Asset a = new Asset(1000, "PC", 3);
        System.out.println("Annual Deprication: " + a.getDeprication());
    }
}
