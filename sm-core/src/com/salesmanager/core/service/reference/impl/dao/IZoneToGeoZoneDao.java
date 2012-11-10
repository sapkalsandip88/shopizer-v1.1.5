/*
 * Licensed to csti consulting 
 * You may obtain a copy of the License at
 *
 * http://www.csticonsulting.com
 * Copyright (c) 2006-Aug 24, 2010 Consultation CS-TI inc. 
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.salesmanager.core.service.reference.impl.dao;

import java.util.Collection;

import com.salesmanager.core.entity.reference.ZoneToGeoZone;

public interface IZoneToGeoZoneDao {

	public void persist(ZoneToGeoZone transientInstance);

	public void saveOrUpdate(ZoneToGeoZone instance);

	public void delete(ZoneToGeoZone persistentInstance);

	public void deleteAll(Collection<ZoneToGeoZone> collection);

	public ZoneToGeoZone merge(ZoneToGeoZone detachedInstance);

	public ZoneToGeoZone findById(int id);

	public Collection<ZoneToGeoZone> findByMerchantId(int merchantid);

}