package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.learning._switch.learning._switch.impl.rev150605.modules.module.configuration.learning._switch.impl;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>learning-switch-impl</b>
 * <br>(Source path: <i>META-INF/yang/learning-switch-impl.yang</i>):
 * <pre>
 * container rpc-registry {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:sdnhub:odl:tutorial:learning-switch:learning-switch-impl?revision=2015-06-05)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>learning-switch-impl/modules/module/configuration/(urn:sdnhub:odl:tutorial:learning-switch:learning-switch-impl?revision=2015-06-05)learning-switch-impl/rpc-registry</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.learning._switch.learning._switch.impl.rev150605.modules.module.configuration.learning._switch.impl.RpcRegistryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.learning._switch.learning._switch.impl.rev150605.modules.module.configuration.learning._switch.impl.RpcRegistryBuilder
 *
 */
public interface RpcRegistry
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.learning._switch.learning._switch.impl.rev150605.modules.module.configuration.learning._switch.impl.RpcRegistry>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:odl:tutorial:learning-switch:learning-switch-impl",
        "2015-06-05", "rpc-registry").intern();


}

