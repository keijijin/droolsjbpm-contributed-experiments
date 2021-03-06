package org.drools;

/*
 * Copyright 2005 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import junit.framework.TestCase;

import org.drools.common.InternalRuleBase;

public class RuleBaseFactoryTest extends TestCase {

    public void testReteOO() {
        final RuleBase rb = RuleBaseFactory.newRuleBase();
        assertTrue( rb instanceof org.drools.reteoo.ReteooRuleBase );

        assertTrue( !"default".equals( ((InternalRuleBase) rb).getId() ) );
        assertTrue( !"".equals( ((InternalRuleBase) rb).getId() ) );
        assertNotNull( ((InternalRuleBase) rb).getId() );

        final RuleBase rb2 = RuleBaseFactory.newRuleBase( RuleBase.RETEOO,
                                                          null );

        assertTrue( rb2 instanceof org.drools.reteoo.ReteooRuleBase );
        assertNotSame( rb2,
                       rb );

        assertTrue( !"default".equals( ((InternalRuleBase) rb2).getId() ) );
        assertTrue( !"".equals( ((InternalRuleBase) rb2).getId() ) );
        assertNotNull( ((InternalRuleBase) rb2).getId() );
    }

}