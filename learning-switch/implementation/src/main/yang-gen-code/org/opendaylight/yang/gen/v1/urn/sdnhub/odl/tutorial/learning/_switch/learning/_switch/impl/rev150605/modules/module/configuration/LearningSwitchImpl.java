package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.learning._switch.learning._switch.impl.rev150605.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.learning._switch.learning._switch.impl.rev150605.modules.module.configuration.learning._switch.impl.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.learning._switch.learning._switch.impl.rev150605.modules.module.configuration.learning._switch.impl.NotificationService;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.learning._switch.learning._switch.impl.rev150605.modules.module.configuration.learning._switch.impl.DataBroker;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>learning-switch-impl</b>
 * <br>(Source path: <i>META-INF/yang/learning-switch-impl.yang</i>):
 * <pre>
 * case learning-switch-impl {
 *     container data-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:sdnhub:odl:tutorial:learning-switch:learning-switch-impl?revision=2015-06-05)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container notification-service {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:sdnhub:odl:tutorial:learning-switch:learning-switch-impl?revision=2015-06-05)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container rpc-registry {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:sdnhub:odl:tutorial:learning-switch:learning-switch-impl?revision=2015-06-05)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>learning-switch-impl/modules/module/configuration/(urn:sdnhub:odl:tutorial:learning-switch:learning-switch-impl?revision=2015-06-05)learning-switch-impl</i>
 *
 */
public interface LearningSwitchImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.learning._switch.learning._switch.impl.rev150605.modules.module.configuration.LearningSwitchImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:odl:tutorial:learning-switch:learning-switch-impl",
        "2015-06-05", "learning-switch-impl").intern();

    DataBroker getDataBroker();
    
    NotificationService getNotificationService();
    
    RpcRegistry getRpcRegistry();

}

