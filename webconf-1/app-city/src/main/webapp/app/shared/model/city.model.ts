import { ICustomer } from 'app/shared/model/customer.model';

export interface ICity {
  id?: number;
  name?: string;
  customers?: ICustomer[];
}

export const defaultValue: Readonly<ICity> = {};
