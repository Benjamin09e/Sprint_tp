import React, { useState } from 'react';
import './classes.css';
import c from '../../assets/images/classe.png';

const Classes = () => {
    const [action, setAction] = useState(null);

    const handleAction = (newAction) => {
        setAction(newAction);
    };

    const getTableContent = () => {
        switch (action) {
            case 'ajouter':
                return (
                    <table className="classeTable">
                        <thead>
                            <tr>
                                <th>Nom de la Classe</th>
                                <th>Niveau</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Classe A</td>
                                <td>12ème année</td>
                            </tr>
                            <tr>
                                <td>Classe B</td>
                                <td>10ème année</td>
                            </tr>
                        </tbody>
                    </table>
                );
            case 'supprimer':
                return (
                    <table className="classeTable">
                        <thead>
                            <tr>
                                <th>Nom de la Classe</th>
                                <th>Niveau</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Classe A</td>
                                <td>12ème année</td>
                                <td>
                                    <button>Supprimer</button>
                                </td>
                            </tr>
                            <tr>
                                <td>Classe B</td>
                                <td>10ème année</td>
                                <td>
                                    <button>Supprimer</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                );
            case 'modifier':
                return (
                    <table className="classeTable">
                        <thead>
                            <tr>
                                <th>Nom de la Classe</th>
                                <th>Nouveau Niveau</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Classe A</td>
                                <td>13ème année</td>
                                <td>
                                    <button>Modifier</button>
                                </td>
                            </tr>
                            <tr>
                                <td>Classe B</td>
                                <td>11ème année</td>
                                <td>
                                    <button>Modifier</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                );
            case 'lister':
                return (
                    <table className="classeTable">
                        <thead>
                            <tr>
                                <th>Nom de la Classe</th>
                                <th>Niveau</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Classe A</td>
                                <td>12ème année</td>
                            </tr>
                            <tr>
                                <td>Classe B</td>
                                <td>10ème année</td>
                            </tr>
                        </tbody>
                    </table>
                );
            default:
                return null;
        }
    };

    return (
        <div className="content_classes">
            <p>Classes</p>
            <div className="container_classes">
                <div className="part_left">
                    <img src={c} alt="" />
                </div>
                <div className="part_right">
                    <button onClick={() => handleAction('ajouter')}>Ajouter une Classe</button>
                    <button onClick={() => handleAction('supprimer')}>Supprimer une Classe</button>
                    <button onClick={() => handleAction('modifier')}>Modifier une Classe</button>
                    <button onClick={() => handleAction('lister')}>Lister Classes</button>

                    {getTableContent()}
                </div>
            </div>
        </div>
    );
};

export default Classes;