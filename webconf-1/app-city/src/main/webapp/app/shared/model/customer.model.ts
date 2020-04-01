import { ICity } from 'app/shared/model/city.model';

export interface ICustomer {
  id?: number;
  name?: string;
  city?: ICity;
}

export const defaultValue: Readonly<ICustomer> = {};
