/*
 * Copyright 2008 Network Engine for Objects in Lund AB [neotechnology.com]
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.remote.sites;

import java.net.URI;

import org.neo4j.remote.RemoteSite;
import org.neo4j.remote.RemoteSiteFactory;

/**
 * A {@link RemoteSiteFactory} that creates {@link RmiSite}s.
 * @author Tobias Ivarsson
 */
public final class RmiSiteFactory extends RemoteSiteFactory
{
    /**
     * Create a new {@link RemoteSiteFactory} for the rmi:// protocol.
     */
    public RmiSiteFactory()
    {
        super( "rmi" );
    }

    @Override
    protected RemoteSite create( URI resourceUri )
    {
        return new RmiSite( resourceUri );
    }

    @Override
    protected boolean handlesUri( URI resourceUri )
    {
        return "rmi".equals( resourceUri.getScheme() );
    }
}
